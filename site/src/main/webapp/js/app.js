'use strict';


// Declare app level module which depends on filters, and services
angular.module('myApp', ['myApp.filters', 'myApp.services', 'myApp.directives']).
  config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', { templateUrl: 'templates/blank.html' });
    $routeProvider.when('/:name', { templateUrl: 'templates/blank.html', controller: PagesController });
    $routeProvider.otherwise({redirectTo: '/'});
  }]);
