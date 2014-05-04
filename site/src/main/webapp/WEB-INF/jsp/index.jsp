<%@ include file="../jspf/htmlTags.jspf" %>
<!doctype html>
<html lang="en" ng-app="myApp">
<head>
  <meta charset="utf-8">
  <title>My AngularJS App</title>
  <link rel="stylesheet" href="<hst:link path="/css/style.css"/>"/>
</head>
<body>
  <ul class="menu">
    <li><a href="#/partial1">partial1</a></li>
    <li><a href="#/partial2">partial2</a></li>
  </ul>

  <div id="views" ng-view></div>

  <div>Angular seed app: v<span app-version></span></div>

  <!-- In production use:
  <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.min.js"></script>
  -->
  
  <script src="<hst:link path="/js/lib/jquery/jquery.min.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular.js"/>"></script>
  <script src="<hst:link path="/js/app.js"/>"></script>
  <script src="<hst:link path="/js/services.js"/>"></script>
  <script src="<hst:link path="/js/controllers.js"/>"></script>
  <script src="<hst:link path="/js/filters.js"/>"></script>
  <script src="<hst:link path="/js/directives.js"/>"></script>
</body>
</html>
