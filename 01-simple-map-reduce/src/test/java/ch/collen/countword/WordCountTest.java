package ch.collen.countword;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.apache.hadoop.mrunit.mapreduce.MapReduceDriver;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.apache.hadoop.mrunit.types.Pair;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class WordCountTest {

    private Mapper<Object, Text, Text, IntWritable> mapper = new TokenizeMapper();
    private Reducer<Text, IntWritable, Text, IntWritable> reducer = new SumReducer();
    private MapDriver mapDriver = MapDriver.newMapDriver(mapper);
    private ReduceDriver reduceDriver = ReduceDriver.newReduceDriver(reducer);
    private MapReduceDriver mapReduceDriver = MapReduceDriver.newMapReduceDriver(mapper, reducer);

    @Test
    public void testMapOnly() throws IOException {
        mapDriver.getConfiguration();
        mapDriver.withInput(new IntWritable(1), new Text("combien de mots dans cette phrase de dingue"));
        mapDriver.withAllOutput(Arrays.asList(
                new Pair<>(new Text("combien"), new IntWritable(1)),
                new Pair<>(new Text("de"), new IntWritable(1)),
                new Pair<>(new Text("mots"), new IntWritable(1)),
                new Pair<>(new Text("dans"), new IntWritable(1)),
                new Pair<>(new Text("cette"), new IntWritable(1)),
                new Pair<>(new Text("phrase"), new IntWritable(1)),
                new Pair<>(new Text("de"), new IntWritable(1)),
                new Pair<>(new Text("dingue"), new IntWritable(1))
        ));
        mapDriver.runTest();
    }

    @Test
    @Ignore
    public void testReducer() throws IOException {
        reduceDriver.withInput(new Pair<>(new Text("combien"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("de"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("mots"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("dans"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("cette"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("phrase"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("de"), new IntWritable(1)))
            .withInput(new Pair<>(new Text("dingue"), new IntWritable(1)));
        reduceDriver.withOutput(new Text("6"), new IntWritable(2));
        reduceDriver.runTest();
    }

    @Test
    public void testMapReduce() throws IOException {
        mapReduceDriver.withInput(new IntWritable(1), new Text("combien de mots dans cette phrase de dingue"));
        mapReduceDriver.withAllOutput(Arrays.asList(
                new Pair<>(new Text("cette"), new IntWritable(1)),
                new Pair<>(new Text("combien"), new IntWritable(1)),
                new Pair<>(new Text("dans"), new IntWritable(1)),
                new Pair<>(new Text("de"), new IntWritable(2)),
                new Pair<>(new Text("dingue"), new IntWritable(1)),
                new Pair<>(new Text("mots"), new IntWritable(1)),
                new Pair<>(new Text("phrase"), new IntWritable(1))
        ));
        //mapReduceDriver.withOutput(new Text("6"), new IntWritable(2));
        mapReduceDriver.runTest();
    }
}
