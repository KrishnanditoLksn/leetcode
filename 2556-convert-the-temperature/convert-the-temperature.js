/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function (celsius) {
    let ans = []
    let kelvin = celsius + 273.15
    let fahrenheit = celsius * 1.80 + 32.00
    if (celsius === 0.00) {
        ans = [kelvin,fahrenheit]
    }
    for (let i = 0; i < celsius; i++) {
        ans = [kelvin, fahrenheit]
    }
    return ans
};