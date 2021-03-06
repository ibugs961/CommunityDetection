package edu.czy.postprocess.mapper;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.VIntWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class PostProcessFirstMapper extends Mapper<Object,Text,VIntWritable,Text>{
	  /**
	   * Called once at the beginning of the task.
	   */
	  protected void setup(Context context
	                       ) throws IOException, InterruptedException {
	    // NOTHING
	  }

	  /**
	   * Called once for each key/value pair in the input split. Most applications
	   * should override this, but the default is the identity function.
	   */
	  @Override
	  protected void map(Object key, Text value, 
	                     Context context) throws IOException, InterruptedException {
		  String[] strs = value.toString().split("\\s");
		  int cid = Integer.parseInt(strs[0]);
		  String tid = strs[1];
		  String nodes = strs[2];
		  context.write(new VIntWritable(cid), new Text(tid+"\t"+nodes));
	  }

	  /**
	   * Called once at the end of the task.
	   */
	  protected void cleanup(Context context
	                         ) throws IOException, InterruptedException {
	    // NOTHING
	  }
	

}
