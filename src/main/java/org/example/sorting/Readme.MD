# SORTING ALGORITHMS ANNOTATIONS

## BUBBLE SORT ~ O(n²):
- Double Loop.
    - Outer from `0` to `array.length - 1`.
    - Inner from `0` to `array.length - 1 - outer`.
- Inner Iteration checks for actual value > next value.
- Swap with temp variable.
- On all Iterations, highest value found is always at the end. Only need to check excluding the index of the Outer Iteration.

## SELECTION SORT ~ O(n²):
- Double Loop.
    - Outer from `0` to `array.length - 1`.
    - Inner from `Outer + 1` to `array.length + 1`.
- Outer Loop saves the index of the lowest found value.
- Inner Loop checks for Lowest value found > Inner Loop value. If true, lowest value is overwritten to Inner Loop value.
    - If false, outside Inner Loop, **SWAP** is made using Outer Loop index and the already found lowest value.
- On all Iterations, lowest value found is always at the start. That's why Inner Loop starts from `Outer + 1`.

## INSERTION SORT ~ O(n²):
- Only one Loop.
    - Two variables:
        - Min value from loop index.
        - Another variable that keeps track of the position to start shifting. Starts with `LOOPVAR - 1`.
- While loop using the variable that keeps track of position to start shift. `Var >= 0` and `array[var] > min value`.
    - Next element is overwritten by the actual element: `{ array[var + 1] = array[var] }`
    - Decrement `var` value by `1` with `VAR--` to keep track of values to shift.
    - On false evaluation, I already have shifted all greater elements to the position of the found MIN value.
    - Stored it elsewhere and now I return it to the correct position.
