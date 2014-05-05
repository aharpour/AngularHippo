'use strict';

/* Controllers */

angular.module('myApp.controllers', [])
  .controller('MyCtrl1', ['$scope', function($scope) {

  }])
  .controller('MyCtrl2', ['$scope', function($scope) {

  }])
    .controller('ArticleCtrl', ['$scope', '$location', '$http', function($scope, $location, $http) {
    	  $http.get('/site'+$location.path()).
    	    success(function(data, status, headers, config) {
    	      $scope.templateUrl = data.template.substr(1);
    	      $scope.content = data;
    	    }).
    	    error(function(data, status, headers, config) {
    	      // log error
    	    });	
}])
;
