package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<String>names;
    Group(){
        this.groupName ="unknown";
        names= new ArrayList<>();
    }
    Group(String name){
        this.groupName =name;
        names= new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Group{" +
                "GroupName='" + groupName + '\'' +
                ", names=" + names +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getMembers() {
        return names;
    }

    public void setMembers(List<String> names) {
        this.names = names;
    }

    public void addMember(String name){
        this.names.add(name);
    }
    public void removeMember(String name){
        this.names.remove(name);
    }

}
