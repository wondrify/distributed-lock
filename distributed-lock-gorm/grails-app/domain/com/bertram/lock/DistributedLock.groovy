package com.bertram.lock

class DistributedLock {
	String name
	String value
	Integer count=0
	Integer maxCount=0
	Long timeout //epoch timeout

	static mapping = {
		timeout index:true
		value index:true
	}
    static constraints = {
    	name unique:true, nullable:false
    	value nullable:true
    	timeout nullable:true
			maxCount nullable: true
			count nullable: true
    }
}
