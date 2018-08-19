package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class WowCharacterRefreshTestCase {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void Test01WowCharacterRefresh_NotLogin() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("WowCharacterRefreshTestCase.xml","Test01");
		executor.execute();
	}
	
	@Test
	public void Test02WowCharacterRefresh_Login() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("WowCharacterRefreshTestCase.xml","Test02");
		executor.execute();
	}
	
	@Test
	public void Test03WowCharacterRefresh_NotExistCharcterId() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("WowCharacterRefreshTestCase.xml","Test03");
		executor.execute();
	}
	
	@Test
	public void Test04WowCharacterRefresh_RangeoutCharacterId() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("WowCharacterRefreshTestCase.xml","Test04");
		executor.execute();
	}
	
	@Test
	public void Test05WowCharacterRefresh_NoNumberCharacterId() throws Exception{
		CaseExecutor executor = new InterfaceStepsExecutor("WowCharacterRefreshTestCase.xml","Test05");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

