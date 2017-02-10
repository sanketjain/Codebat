
class CanNotHopException extends Exception { }

class Hopper {
	public void hop() { }
//	public void hop() throws CanNotHopException { }
//	public void hop() throws Exception { }
}

class Bunny extends Hopper {
//	public void hop() throws CanNotHopException { }
//	public void hop() { }
	public void hop() throws IllegalStateException { }

}

