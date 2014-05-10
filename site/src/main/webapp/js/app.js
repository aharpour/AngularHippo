'use strict';

// Declare app level module which depends on filters, and services
angular.module('myApp',
		[ 'myApp.filters', 'myApp.services', 'myApp.directives', 'myApp.controllers', 'ngRoute', 'ngSanitize']).config(
		[ '$routeProvider', function($routeProvider) {
			$routeProvider.when('#/common/homepage', {
				templateUrl : 'templates/blank.html'
			});
			$routeProvider.when('/:sub1?/:sub2?/:sub3?/:sub4?/:sub5?', {
				controller : 'ArticleCtrl',
				template : '<article ng-include="templateUrl"></article>'
			});
			$routeProvider.otherwise({
				redriectTo : '#/common/homepage'
			});
		} ]);
