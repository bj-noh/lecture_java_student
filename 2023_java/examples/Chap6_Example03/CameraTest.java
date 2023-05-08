package Chap6_Example03;

public class CameraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camera camera1 = new Camera("Sony", 1280, 1000000, false);
		Camera camera2 = new Camera("Canon", 2580, 2000000, true);
		
		System.out.println("Camera1 info: ");
		camera1.showCameraInfo();

		System.out.println("Camera2 info: ");
		camera2.showCameraInfo();
		
		System.out.println("Model name of Camera1: " + camera1.getModel());		
		System.out.println("Megapixels of Camera1: " + camera1.getMegapixels());
		System.out.println("Price of Camera1: " + camera1.getPrice());		
		System.out.println("Wifi of Camera1: " + camera1.hasWifi());		

		System.out.println("Model name of Camera2: " + camera2.getModel());		
		System.out.println("Megapixels of Camera2: " + camera2.getMegapixels());
		System.out.println("Price of Camera2: " + camera2.getPrice());		
		System.out.println("Wifi of Camera2: " + camera2.hasWifi());
		
		System.out.println("Camera1 Zoom operations");
		camera1.zoomIn();
		camera1.zoomIn();
		camera1.zoomOut();		

		System.out.println("Camera2 Zoom operations");
		camera2.zoomIn();
		camera2.zoomIn();
		camera2.zoomOut();
		camera2.zoomOut();
		
		
		
		

	}

}
