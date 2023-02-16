from xml.dom import minidom


dom = minidom.parse("TradeSecret.xml")

# get elements by tag name
trade_secret = dom.getElementsByTagName("name")[0]
print(trade_secret.firstChild.data)

# get element by tag name "staff"
skills = []
niggers = dom.getElementsByTagName("staff")
print("\nEmployees")
for nig in niggers:
    nig_id = nig.getAttribute("id")
    name  = nig.getElementsByTagName("name")[0].firstChild.data
    salary = nig.getElementsByTagName("salary")[0].firstChild.data
    skils = nig.getElementsByTagName("skills")
    for skil in skils:
        s = skil.getAttribute("name")
        skills.append(s)
        
    print(f"\nName : {name}\nSalary : {salary}\nSkills:{skills}")
    skills.clear()
    # skills = []