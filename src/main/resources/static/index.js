angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8181/app';

    $scope.loadNumbers = function () {
        $http.get(contextPath + '/numbers')
            .then(function (response) {
                $scope.NumbersList = response.data;
            });
    };

    $scope.deleteNumberDecimal = function (numberId) {
        $http.get(contextPath + '/numbers/delete/' + numberId)
            .then(function (response) {
                $scope.loadNumbers();
            });
    }
    $scope.changeNumber = function (numberId, delta) {
        $http({
            url: contextPath + '/numbers/change_number',
            method: 'GET',
            params: {
                numberId: numberId,
                delta: delta
            }
        }).then(function (response) {
            $scope.loadNumbers();
        });
    }

    $scope.loadNumbers();
});