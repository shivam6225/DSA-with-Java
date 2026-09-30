import re
from collections import defaultdict

with open('README.md', 'r') as f:
    content = f.read()

# We need to parse the table we just created.
# Format: | 54 | [Spiral Matrix I](...) | Medium 🟡 | Arrays | [Solution](...) |
# Or we can just use the same script logic from earlier but generate the summary.

pattern = re.compile(r'\|\s*(\d+)\s*\|\s*\[.*?\]\(.*?\)\s*\|\s*(Easy 🟢|Medium 🟡|Hard 🔴)\s*\|\s*(.*?)\s*\|.*?\|')
matches = pattern.findall(content)

# matches is a list of tuples: (number, difficulty, topic)

summary = defaultdict(lambda: {'Easy': 0, 'Medium': 0, 'Hard': 0, 'Total': 0})
total_stats = {'Easy': 0, 'Medium': 0, 'Hard': 0, 'Total': 0}

for num, difficulty, topic in matches:
    topic = topic.strip()
    if 'Easy' in difficulty:
        summary[topic]['Easy'] += 1
        total_stats['Easy'] += 1
    elif 'Medium' in difficulty:
        summary[topic]['Medium'] += 1
        total_stats['Medium'] += 1
    elif 'Hard' in difficulty:
        summary[topic]['Hard'] += 1
        total_stats['Hard'] += 1
    
    summary[topic]['Total'] += 1
    total_stats['Total'] += 1

# Create the summary table
table_lines = [
    "### 📊 LeetCode Summary by Topic",
    "",
    "| Topic / Phase | Total Questions | Easy 🟢 | Medium 🟡 | Hard 🔴 |",
    "|:---|:---:|:---:|:---:|:---:|"
]

for topic in sorted(summary.keys()):
    stats = summary[topic]
    table_lines.append(f"| {topic} | {stats['Total']} | {stats['Easy']} | {stats['Medium']} | {stats['Hard']} |")

# Add a total row
table_lines.append(f"| **Total** | **{total_stats['Total']}** | **{total_stats['Easy']}** | **{total_stats['Medium']}** | **{total_stats['Hard']}** |")
table_lines.append("")

summary_text = "\n".join(table_lines)

# Now, we want to insert this right before "## 🏆 LeetCode Questions Solved"
# Or just replace the heading "## 🏆 LeetCode Questions Solved" with this summary and the heading.

new_content = content.replace("## 🏆 LeetCode Questions Solved", "## 🏆 LeetCode Questions Solved\n\n" + summary_text + "\n### 📋 Detailed Questions List")

with open('README.md', 'w') as f:
    f.write(new_content)
