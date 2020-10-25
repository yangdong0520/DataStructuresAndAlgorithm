package Transport;

public class ContexyFactory {
        private transport tr;
        public void setTransportWay(double distance) {
        	if(distance < 500 && distance > 0) {
        		this.tr=new ByCar();
        		tr.transport();
        	}
        	else if(distance >= 500 && distance <= 1000) {
        		this.tr=new ByTrain();
        		tr.transport();
        	}else if(distance>1000) {
        		this.tr=new ByPlane();
        		tr.transport();
        	}
        }
}
