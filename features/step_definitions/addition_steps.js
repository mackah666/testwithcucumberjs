const assert = require('assert')

const { Before, Given, When, Then } = require('cucumber')

const Calculator = require('../../lib/calculator');

let calculator;

Given('the numbers {int} and {int}', function (x, y, callback) {
    // Write code here that turns the phrase above into concrete actions
    calculator = new Calculator(x,y);
    callback();
	
});


When('they are added together', function (callback) {
    // Write code here that turns the phrase above into concrete actions
    calculator.add();
    callback();
});

Then('should the result be {int}', function (expected) {
    // Write code here that turns the phrase above into concrete actions
    assert.equal(calculator.getResult(), expected);
    //callback();
});
