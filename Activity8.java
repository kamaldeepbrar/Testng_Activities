<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Activity8" parallel ="classes">
    <test name="Test8" >
     <parameter name = "username" value = "admin" />
     <parameter name = "password" value = "password" />
      <classes>
      <class name = "suiteExample.DemoOne"/>
      <class name = "suiteExample.DemoTwo"/>
      <class name = "suiteExample.Activity5"/>
      <class name = "suiteExample.Activity6"/>
     <class name = "suiteExample.Activity7"/>
     </classes>
     </test>
     </suite>
