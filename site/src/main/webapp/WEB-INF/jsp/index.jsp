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
    <li><a href="#/common/homepage">Home</a></li>
    <li><a href="#/common/about-us">About us</a></li>
    <li><a href="#/news/2011/toyota-suggests-putting-a-glass-of-water-on-your-dash">Toyota</a></li>
    <li><a href="#/news/2011/solar-power-the-sky-is-the-limit">Solar power</a></li>
    <li><a href="#/news/2011/pbs-show-asserts-greenhouse-gases-atmospheric-pollutants-dimming-future">Atmospheric pollutants</a></li>
  </ul>

  <div id="views" ng-view></div>

  <!-- In production use:
  <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.min.js"></script>
  -->
  
  <script src="<hst:link path="/js/lib/jquery/jquery.min.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular-route.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular-resource.js"/>"></script>  
  <script src="<hst:link path="/js/app.js"/>"></script>
  <script src="<hst:link path="/js/services.js"/>"></script>
  <script src="<hst:link path="/js/controllers.js"/>"></script>
  <script src="<hst:link path="/js/filters.js"/>"></script>
  <script src="<hst:link path="/js/directives.js"/>"></script>
</body>
</html>
