<%@ page language="java" contentType="application/json; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/taglibs.jspf" %>
{"model":${model},
"config":${config}
, "children": {
<c:forEach items="${childContentNames}" var="child" varStatus="status">
${status.index != 0 ? ',' : ''}
"${child}": <hst:include ref="${child}"/>
</c:forEach>
}
}



