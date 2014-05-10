<%@ include file="../jspf/htmlTags.jspf" %>

<!doctype html>
<html lang="en" ng-app="myApp">
  <head>
    <meta charset="utf-8"/>
    <title>hippo78 Home Page</title>
<!--[if lt IE 9]>
        <script type="text/javascript" src="/site/js/html5shiv.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="/site/css/style.css" type="text/css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>
  <body>
    <div class="container-fluid">
  <div class="row-fluid">
    <div class="span2"></div>
    <div class="span8">
      <div class="navbar">
        <div class="navbar-inner">
          <div class="container">
            <h1><a class="brand" href="/site">HST Website</a></h1>
            <div class="nav-collapse">
              <ul class="nav pull-right">
                <li>
                  <form class="navbar-search form-search" action="/site/search" method="get">
                    <p>
                      <input type="text" name="query" class="search-query input-xlarge" placeholder="Search" required="required"/>
                      <button class="btn btn-primary inline" type="submit" value="Search">Search</button>
                    </p>
                  </form>
                </li>
              </ul>

            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="span2"></div>
  </div>
</div><div class="container-fluid">
  <div class="row-fluid">
    <nav class="span2">
      <ul class="nav nav-pills nav-stacked">
   		<li><a href="#/common/homepage">Home</a></li>
	    <li><a href="#/common/about-us">About us</a></li>
	    <li><a href="#/news/2011/toyota-suggests-putting-a-glass-of-water-on-your-dash">Toyota</a></li>
	    <li><a href="#/news/2011/solar-power-the-sky-is-the-limit">Solar power</a></li>
	    <li><a href="#/news/2011/pbs-show-asserts-greenhouse-gases-atmospheric-pollutants-dimming-future">Atmospheric pollutants</a></li>
	  </ul>
	</nav>
	<div id="views" ng-view></div>
    <aside class="span2">
      <p>This is the right column.</p>
</aside>
  </div>
</div>
  <script src="<hst:link path="/js/lib/jquery/jquery.min.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular-route.js"/>"></script>
  <script src="<hst:link path="/js/lib/angular/angular-resource.js"/>"></script>  
  <script src="<hst:link path="/js/lib/angular/angular-sanitize.js"/>"></script>  
  <script src="<hst:link path="/js/app.js"/>"></script>
  <script src="<hst:link path="/js/services.js"/>"></script>
  <script src="<hst:link path="/js/controllers.js"/>"></script>
  <script src="<hst:link path="/js/filters.js"/>"></script>
  <script src="<hst:link path="/js/directives.js"/>"></script>
</body>
</html>
