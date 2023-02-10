package ocp.exame.iteration.exercise;

import ocp.exame.iteration.exercise.model.ObjectA;
import ocp.exame.iteration.exercise.model.ObjectB;
import ocp.exame.iteration.exercise.model.ObjectB2;
import ocp.exame.iteration.exercise.model.ObjectDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Output should be "ID | YEAR / NUMBER" - exercise trying to iterate nested lists.
public class IterationMapMain {
    public static void main(String[] args) {
        List<ObjectA> objectAList = setAList();
        Map<Long, ObjectDto> longObjectDtoMap = new HashMap<>();
        Map<Long, List<ObjectB>> longListMap = new HashMap<>();

        List<ObjectDto> objectDtos = new ArrayList<>();

        objectAList.forEach(objectA -> {
            longListMap.put(objectA.getId(), objectA.getObjektBList());
            longObjectDtoMap.put(objectA.getId(), new ObjectDto(objectA.getId()));
        });

        longListMap.forEach((id, objectBS) -> {
            ObjectDto objectDto = longObjectDtoMap.get(id);
            for (ObjectB objectB : objectBS) {
                objectDto.setId(id);
                objectDto.setObjectB2(objectB.getObjectB2());
                objectDtos.add(objectDto);

                objectDto = new ObjectDto();
            }
        });

        objectDtos.forEach(objectDto -> System.out.println("OUTOUT = (" + objectDto.getId() + " | " + objectDto.getObjectB2().getYear() + " / " + objectDto.getObjectB2().getNubmer() + ")"));
    }


    private static List<ObjectA> setAList() {
        ObjectB2 objectB2_1 = new ObjectB2(11, "2001");
        ObjectB2 objectB2_2 = new ObjectB2(12, "2002");
        ObjectB2 objectB2_3 = new ObjectB2(13, "2003");
        ObjectB2 objectB2_4 = new ObjectB2(14, "2004");
        ObjectB2 objectB2_5 = new ObjectB2(15, "2005");

        ObjectB objectB1_1 = new ObjectB("Silver", new BigDecimal("22.44"), objectB2_1);
        ObjectB objectB1_2 = new ObjectB("Maw", new BigDecimal("356.265"), objectB2_2);
        ObjectB objectB1_3 = new ObjectB("Broom", new BigDecimal("234.352"), objectB2_3);
        ObjectB objectB1_4 = new ObjectB("Rock", new BigDecimal("777"), objectB2_4);
        ObjectB objectB1_5 = new ObjectB("Soul", new BigDecimal("3457"), objectB2_5);

        List<ObjectB> objectBList_1 = new ArrayList<>();
        List<ObjectB> objectBList_2 = new ArrayList<>();
        List<ObjectB> objectBList_3 = new ArrayList<>();
        objectBList_1.add(objectB1_1);
        objectBList_1.add(objectB1_2);
        objectBList_1.add(objectB1_3);

        objectBList_2.add(objectB1_4);

        objectBList_3.add(objectB1_5);
        objectBList_3.add(objectB1_1);

        ObjectA objectA1_1 = new ObjectA(1L, objectBList_1);
        ObjectA objectA1_2 = new ObjectA(2L, objectBList_2);
        ObjectA objectA1_3 = new ObjectA(3L, objectBList_3);

        List<ObjectA> objectAList = new ArrayList<>();
        objectAList.add(objectA1_1);
        objectAList.add(objectA1_2);
        objectAList.add(objectA1_3);

        return objectAList;
    }
}
