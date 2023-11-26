package com.easybytes.main;

import com.easybytes.beans.Person;
import com.easybytes.config.ProjectConfig;
import com.easybytes.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1: " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2: " + vehicleServices2.hashCode());

        vehicleServices1.playMusic();
        vehicleServices1.movingVehicle();
        if(vehicleServices1 == vehicleServices2){
            System.out.println("VehicleServices bean is a singleton bean");
        }else{
            System.out.println("VehicleServices bean is a prototype bean");
        }

        /*
        * Do Vehicle là singleton , vehicleServices là inject vào vehicle
        * nên khi chạy spring quét Vehicle và thấy có vehicleServices inject
        * Spring sẽ xuất ra dòng đầu tiên
        * - Tiếp theo Spring scan vehicleService và trả về kết quả 1 instance mới cho vehicle
        * -> Xuất dòng thứ 2
        * - Spring scan lần 2 và trả về 1 instance mới vehicleServices vào vehicle
        * - Xuất lần 3
        * */
    }
}