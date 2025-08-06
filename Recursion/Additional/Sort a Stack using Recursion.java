sortStack(stack):
    if not empty:
        top = stack.pop()
        sortStack(stack)
        insertInSorted(stack, top)

insertInSorted(stack, element):
    if empty or top <= element:
        stack.push(element)
    else:
        top = stack.pop()
        insertInSorted(stack, element)
        stack.push(top)
