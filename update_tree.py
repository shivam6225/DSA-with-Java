import os

def generate_tree(path, prefix=""):
    items = sorted(os.listdir(path))
    items = [i for i in items if not i.startswith('.')]
    tree_lines = []
    for i, item in enumerate(items):
        is_last = (i == len(items) - 1)
        connector = "└── " if is_last else "├── "
        tree_lines.append(f"{prefix}│   {connector}{item}")
        
        full_path = os.path.join(path, item)
        if os.path.isdir(full_path):
            extension = "    " if is_last else "│   "
            tree_lines.extend(generate_tree(full_path, prefix + extension))
    return tree_lines

bitwise_tree = ["├── bitwise/                                            # Bitwise operators and magic numbers (10)"]
bitwise_tree.extend(generate_tree("bitwise"))

maths_tree = ["├── maths/                                              # Mathematics for DSA (6)"]
maths_tree.extend(generate_tree("maths"))

with open('README.md', 'r') as f:
    lines = f.readlines()

# Instead of updating the tree dynamically with python which is hard because we have to parse the existing one with comments,
# let's just create the bitwise and maths string and replace math-and-bit-manipulation/ line.

bitwise_str = "\n".join(bitwise_tree)
maths_str = "\n".join(maths_tree)
print(bitwise_str)
print(maths_str)
