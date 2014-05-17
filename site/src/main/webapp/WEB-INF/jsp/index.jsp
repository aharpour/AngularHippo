<%@ include file="../jspf/htmlTags.jspf" %>
<!doctype html>
<html lang="en" ng-app="myApp">
  <head>
    <meta charset="utf-8"/>
    <title>Home Page</title>
    <link rel="stylesheet" href="/web/css/style.css" type="text/css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    
    <hst:link path="/" var="contextPath"/>
    
    <script type="text/javascript">
    	var contextPath = "${contextPath eq '/' ? '' : contextPath}";
    </script>
  </head>
  <body>
  <div id="views" ng-view></div>
  <script src="/web/js/lib/jquery/jquery.min.js"></script>
  <script src="/web/js/lib/angular/angular.js"></script>
  <script src="/web/js/lib/angular/angular-route.js"></script>
  <script src="/web/js/lib/angular/angular-resource.js"></script>  
  <script src="/web/js/lib/angular/angular-sanitize.js"></script>  
  <script src="/web/js/app.js"></script>
  <script src="/web/js/services.js"></script>
  <script src="/web/js/controllers.js"></script>
  <script src="/web/js/filters.js"></script>
  <script src="/web/js/directives.js"></script>
</body>
</html>
