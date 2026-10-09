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

print("\n".join(["├── oop/                                                # OOP principles, custom generics & collections"] + generate_tree("oop")))
