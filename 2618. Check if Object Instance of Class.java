var checkIfInstanceOf = function(obj, classFunction) {
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }

    let curr = Object(obj);

    while (curr !== null) {
        curr = Object.getPrototypeOf(curr);
        if (curr === classFunction.prototype) {
            return true;
        }
    }

    return false;
};
