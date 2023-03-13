

### Unit testing java #3
@Test 
 
    public void readCSVTest() {
    	
    	
    	ReadCSVExample1 readCVS = new ReadCSVExample1();
    	
    	readCVS.setArray();
    	// to test if the CVS not empty
    	String test =  readCVS.getArray().toString();
    	
    	
    	// if data is not null 
    	assertNotNull(test);
    	
    	// if the length is not null
    	assertTrue(  test.length() > 0);
    	
    	
    	readCVS.clearArray();
    	assertEquals(0, readCVS.getArray().size() );
    	
    	String name = "ville";
    	
    	readCVS.addFriends(name);
    	assertTrue(readCVS.getArray().contains(name) );
    	
    	readCVS.removeFriends(name);
    	assertFalse(readCVS.getArray().contains(name) );
    		
    	
    }


	### Unit Auto-test with selenium java #4
    @Test
    public void testOne(){
        String getProduktName = loginTest(); 

        boolean loginErorr = loginErorr(); 
        

        assertFalse(loginErorr);

        assertTrue(  getProduktName.length() > 0);


    }