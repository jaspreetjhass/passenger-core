package org.jp.passenger.core.utility;

public enum Status {

	OK("OK");

	private String value;

	Status(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
