const assert = require('assert');
const { sum } = require('./lib/sum');

assert.strictEqual(sum(1, 2), 3, '1+2 should be 3');
assert.strictEqual(sum(-1, 1), 0, '-1+1 should be 0');

console.log('All tests passed');
