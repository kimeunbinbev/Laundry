/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.laundry;

/**
 *
 * @author pc22-1008
 */
public class WashingMachine {

    // private static 변수를 사용하여 유일한 WashingMachine 인스턴스를 저장합니다.
    private static WashingMachine instance;

    // 외부에서 인스턴스를 직접 생성하지 못하도록 생성자를 private로 선언합니다.
    private WashingMachine() {}

    // 유일한 WashingMachine 인스턴스를 반환하는 public static 메소드를 제공합니다.
    public static WashingMachine getInstance() {
        // 인스턴스가 아직 생성되지 않았다면 새로 생성합니다.
        if (instance == null) {
            instance = new WashingMachine();
        }
        return instance;
    }

    // 세탁 기능을 시뮬레이션하는 메소드입니다.
    public void wash(String clothes) {
        System.out.println(clothes + "를 세탁합니다.");
    }
}
