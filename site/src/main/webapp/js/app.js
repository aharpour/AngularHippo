'use strict';

// Declare app level module which depends on filters, and services
angular.module('myApp',
		[ 'myApp.filters', 'myApp.services', 'myApp.directives', 'myApp.controllers' ]).config(
		[ '$routeProvider', function($routeProvider) {
			$routeProvider.when('#/common/homepage', {
				templateUrl : 'templates/blank.html'
			});
			$routeProvider.when('/:sub1', {
				controller : 'ArticleCtrl',
				template : '<article ng-include="templateUrl"></article>'
			});
			$routeProvider.when('/:sub1/:sub2', {
				controller : 'ArticleCtrl',
				template : '<article ng-include="templateUrl"></article>'
			});
			$routeProvider.when('/:sub1/:sub2/:sub3', {
				controller : 'ArticleCtrl',
				template : '<article ng-include="templateUrl"></article>'
			});
			$routeProvider.otherwise({
				redriectTo : '#/common/homepage'
			});
		} ]);
