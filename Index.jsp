<%@taglib uri="/struts-tags" prefix="html" %>
<h1>Good Morning!</h1>
<html:form action="greet">
<html:textfield name="name" lebel="Name"/>
<html:submit value="say"/>
</html:form>
