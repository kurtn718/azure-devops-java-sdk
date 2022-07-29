package org.azd.distributedtask.types;
/**
----------------------------------------------------------
	GENERATED FILE, should be edited to suit the purpose.
----------------------------------------------------------
**/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * Provides data necessary for authorizing the agent using OAuth 2.0 authentication flows. 
**/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertiesCollection {
	/**
 	* The count of properties in the collection. 
	**/
	@JsonProperty("count")
	private Integer count;

	@JsonProperty("item")
	private Object item;
	/**
 	* The set of keys in the collection. 
	**/
	@JsonProperty("keys")
	private String[] keys;
	/**
 	* The set of values in the collection. 
	**/
	@JsonProperty("values")
	private String[] values;

	public Integer getCount() { return count; }

	public void setCount(Integer count) { this.count = count; }

	public Object getItem() { return item; }

	public void setItem(Object item) { this.item = item; }

	public String[] getKeys() { return keys; }

	public void setKeys(String[] keys) { this.keys = keys; }

	public String[] getValues() { return values; }

	public void setValues(String[] values) { this.values = values; }

	@Override
	public String toString() {
		return "PropertiesCollection{" +
				"count=" + count +
				", item=" + item +
				", keys=" + Arrays.toString(keys) +
				", values=" + Arrays.toString(values) +
				'}';
	}
}