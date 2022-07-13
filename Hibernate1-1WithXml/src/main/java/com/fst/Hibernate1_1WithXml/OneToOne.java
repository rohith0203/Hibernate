package com.fst.Hibernate1_1WithXml;

public @interface OneToOne {

	Class<Address> targetEntity();

	String cascade();

}
