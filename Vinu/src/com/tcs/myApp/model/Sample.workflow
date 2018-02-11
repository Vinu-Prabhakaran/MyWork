<?xml version="1.0" encoding="UTF-8"?>

<workflow-app xmlns="uri:oozie:workflow:0.5" name="Sample.workflow">
  <start to="email-1"/>
  <action name="email-1">
    <email xmlns="uri:oozie:email-action:0.2">
      <to>vinu.cp@gmail.com</to>
      <subject>Job ended OK</subject>
      <body>Hi Vinu, The work flow ended ok.</body>
    </email>
    <ok to="end"/>
  </action>
  <end name="end"/>
</workflow-app>
<!--
<workflow>
  <node name="start" x="50" y="100"/>
  <node name="email-1" x="491" y="94"/>
  <node name="end" x="817" y="92"/>
</workflow>-->
