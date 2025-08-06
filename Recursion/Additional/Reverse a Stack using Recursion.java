reverseStack(stack):
    if not empty:
        top = stack.pop()
        reverseStack(stack)
        insertAtBottom(stack, top)

insertAtBottom(stack, element):
    if empty:
        stack.push(element)
    else:
        top = stack.pop()
        insertAtBottom(stack, element)
        stack.push(top)
