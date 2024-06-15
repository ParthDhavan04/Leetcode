/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    var a = 0;
    var b = 1;
    while(true) {
        yield a;
        var c = a + b;
        a = b;
        b = c;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
