import re
from collections import defaultdict

with open('README.md', 'r') as f:
    content = f.read()

# First, extract all LeetCode questions
pattern = re.compile(r'- \[x\] \[(.*?)\s*\(LeetCode\s*(\d+)\)\]\((.*?)\)')
matches = pattern.findall(content)

easy_set = {
    '1', '9', '13', '14', '20', '21', '26', '27', '28', '35', '58', '66', '67', '69', '70', '83', '88', 
    '94', '100', '101', '104', '108', '110', '111', '112', '118', '119', '121', '125', '136', '141', 
    '144', '145', '160', '167', '168', '169', '171', '190', '191', '202', '203', '205', '206', '217', 
    '219', '225', '226', '228', '231', '232', '234', '242', '257', '258', '268', '278', '283', '290', 
    '292', '303', '326', '338', '342', '344', '345', '349', '350', '367', '374', '383', '387', '389', 
    '392', '401', '404', '405', '409', '412', '414', '415', '441', '448', '455', '459', '461', '463', 
    '476', '485', '492', '495', '496', '500', '501', '504', '506', '507', '509', '520', '521', '530', 
    '541', '543', '551', '557', '559', '561', '563', '566', '572', '575', '589', '590', '594', '598', 
    '599', '605', '606', '617', '628', '637', '643', '645', '653', '657', '661', '671', '674', '680', 
    '682', '693', '696', '697', '700', '703', '704', '705', '706', '709', '717', '724', '728', '733', 
    '744', '746', '747', '748', '762', '766', '771', '832', '867', '1252', '1281', '1295', '1304', '1342', '1346', '1351', '1365', '1389', '1431', '1470', '1480', '1512', '1572', '1672', '1732', '1773', '1832', '1854', '1886', '1920', '1929'
}

hard_set = {
    '4', '10', '23', '25', '32', '37', '41', '42', '44', '51', '52', '65', '68', '72', '76', '84', '85', 
    '87', '97', '99', '115', '123', '124', '126', '127', '132', '135', '140', '149', '154', '164', '174', 
    '188', '212', '214', '218', '224', '233', '239', '273', '282', '295', '297', '301', '312', '315', 
    '316', '321', '327', '329', '330', '332', '335', '336', '352', '354', '363', '381', '391', '403', 
    '407', '410', '420', '432', '440', '446', '460', '466', '472', '479', '480', '483', '488', '493', '1095'
}

# Add all newly parsed ones to detailed list
detailed_lines = [
    "### 📋 Detailed Questions List",
    "",
    "| # | Title | Difficulty | Topic / Phase | Link |",
    "|:---|:---|:---:|:---|:---|"
]

summary = defaultdict(lambda: {'Easy': 0, 'Medium': 0, 'Hard': 0, 'Total': 0})
total_stats = {'Easy': 0, 'Medium': 0, 'Hard': 0, 'Total': 0}

for title, num, link in sorted(matches, key=lambda x: int(x[1])):
    diff = "Easy 🟢" if num in easy_set else ("Hard 🔴" if num in hard_set else "Medium 🟡")
    
    topic = "Arrays"
    if "searching" in link: topic = "Searching"
    elif "sorting" in link: topic = "Sorting"
    elif "strings" in link: topic = "Strings"
    elif "condition-loops" in link: topic = "Conditionals/Loops"
    elif "recursion" in link: topic = "Recursion"
    
    detailed_lines.append(f"| {num} | [{title}]({link}) | {diff} | {topic} | [Solution]({link}) |")
    
    if 'Easy' in diff:
        summary[topic]['Easy'] += 1
        total_stats['Easy'] += 1
    elif 'Medium' in diff:
        summary[topic]['Medium'] += 1
        total_stats['Medium'] += 1
    elif 'Hard' in diff:
        summary[topic]['Hard'] += 1
        total_stats['Hard'] += 1
    
    summary[topic]['Total'] += 1
    total_stats['Total'] += 1

summary_lines = [
    "## 🏆 LeetCode Questions Solved",
    "",
    "### 📊 LeetCode Summary by Topic",
    "",
    "| Topic / Phase | Total Questions | Easy 🟢 | Medium 🟡 | Hard 🔴 |",
    "|:---|:---:|:---:|:---:|:---:|"
]

for topic in sorted(summary.keys()):
    stats = summary[topic]
    summary_lines.append(f"| {topic} | {stats['Total']} | {stats['Easy']} | {stats['Medium']} | {stats['Hard']} |")

summary_lines.append(f"| **Total** | **{total_stats['Total']}** | **{total_stats['Easy']}** | **{total_stats['Medium']}** | **{total_stats['Hard']}** |")
summary_lines.append("")

# Replace everything from "## 🏆 LeetCode Questions Solved" onwards
new_text = "\n".join(summary_lines) + "\n".join(detailed_lines)

# Split by the heading
parts = content.split("## 🏆 LeetCode Questions Solved")
new_content = parts[0] + new_text + "\n"

with open('README.md', 'w') as f:
    f.write(new_content)
