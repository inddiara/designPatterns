package facade;

public class ComputadorFacade {
	private Cpu cpu = null;
    private Memoria memoria = null;
    private Hd hardDrive = null;
 
    public ComputadorFacade(Cpu cpu,
                    Memoria memoria,
                    Hd hardDrive) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.hardDrive = hardDrive;
    }
 
    public void ligarComputador() {
        cpu.start();
        memoria.load();
        cpu.execute();
        hardDrive.read();

    }
}
