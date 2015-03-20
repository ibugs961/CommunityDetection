package edu.czy.datastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author CHENZHIYUN
 * @date 2014/6/18
 */
public class Vertex {
	//id identifies the vertex from the graph/network
	private long id;
	private String label;
	//value means community id or label generated by the algorithm
	private String value;
	//groundTruth means ground truth
	private String groundTruth;
	private List<Double> weight;
	private Map<Integer,Double> communityDistribution;
	/**
	 * @return the groundTruth
	 */
	public String getGroundTruth() {
		return groundTruth;
	}
	/**
	 * @param groundTruth the groundTruth to set
	 */
	public void setGroundTruth(String groundTruth) {
		this.groundTruth = groundTruth;
	}
	/**
	 * Initialize the vertex's id and its labels without any information.
	 */
	public Vertex(){
		this(-1, "");
	}
	/**
	 * Initialize the vertex's id with the given ID, but nothing about the labels.
	 */
	public Vertex(int id){
		this(id, "");
	}
	/**
	 * 
	 */
	public Vertex(int id, String label){
		this.id = id;
		this.label = label;
		this.value = null;
		this.groundTruth = null;
		this.weight=null;
		this.communityDistribution = new HashMap<Integer,Double>();
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @param fake the fake to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the fake
	 */
	public String getValue() {
		if(value != null)
			return value;
		else
			return null;
	}
	public List<Double> getWeight() {
		return weight;
	}
	public void setWeight(List<Double> weight) {
		this.weight = weight;
	}
	/**
	 * Show the message of the vertex
	 */
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("");
		sb.append("vertex id is:");
		sb.append(id);
		sb.append(", label is:");
		sb.append(label);
		sb.append(", value is:");
		sb.append(value);
		return sb.toString();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Map<Integer, Double> getCommunityDistribution() {
		return communityDistribution;
	}
	public void setCommunityDistribution(Map<Integer, Double> communityDistribution) {
		this.communityDistribution = communityDistribution;
	}
}
