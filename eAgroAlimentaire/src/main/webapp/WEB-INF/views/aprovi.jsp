<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%> <head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/css/style.css">
</head>
<div id="formAli" class="cadre">
<f:form modelAttribute="Ali" action="saveAli" method="post" enctype="multipart/form-data">
<table>
<tr>
<td>ID :</td>
<td>${Ali.idAliment}<f:input type="hidden" path="idAliment"/></td> 
<td><f:errors path="idAliment"></f:errors> </td>
</tr> 
<tr>
<td>Nom Aliment</td>
<td><f:input path="nomAliment"/></td>
<td><f:errors path="nomAliment"></f:errors> </td> 
</tr>
<tr>
<td>date Peremption</td>
<td><f:textarea path="datePeremption"/></td>
 <td><f:errors path="datePeremption"></f:errors> </td>
</tr>
<tr>
<td>Qte Aliment</td>
<td><f:textarea path="qteAliment"/></td>
 <td><f:errors path="qteAliment"></f:errors> </td>
</tr>
<tr>
<td>prix Aliment</td>
<td><f:textarea path="prixAliment"/></td>
 <td><f:errors path="prixAliment"></f:errors> </td>
</tr>

<tr>

<td><input type="submit" value="AjouterAliment"></td>
  </tr>
</table>
</f:form>
</div>



<div id="" class="cadre"> 
<table class="tabStyle1">

<tr>
  <th>ID</th><th>NOM Aliment</th><th>date Peremption</th><th>qteAliment</th>
  <th>prixAliment</th>
  <th></th><th></th>
</tr>

<c:forEach items="${Alis}" var="al">

<tr>
<td>${al.idAliment }</td>
<td>${al.nomAliment}</td>

<td>${al.datePeremption}</td>
<td>${al.qteAliment}</td>
<td>${al.prixAliment }</td>
<td><a href="suppAli?idAliment=${al.idAliment}">Supprimer</a></td>
 <td><a href="editAli?idAliment=${al.idAliment}">Edit</a></td>
  </tr>
</c:forEach>
</table>
</div>