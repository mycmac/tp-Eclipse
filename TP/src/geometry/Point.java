package geometry;



public class Point {

	/**
	 * Abs. du point.
	 */
	protected int x;
	
	/**
	 * ord. du point.
	 */
	protected int y;

	/**
	 * Contructeur de la classe Point.
	 */
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructeur de la classe Point.
	 * @param abs
	 * @param ord
	 */
	public Point(int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}

	/**
	 * @return le abs
	 */
	public int getAbs() {
		return x;
	}

	/**
	 * @param abs le abs à définir
	 */
	public void setAbs(int abs) {
		this.x = abs;
	}

	/**
	 * @return le ord
	 */
	public int getOrd() {
		return y;
	}

	/**
	 * @param ord le ord à définir
	 */
	public void setOrd(int ord) {
		this.y = ord;
	}

	/**
	 * Translate un point. 
	 * @param a
	 * @param b
	 */
	public void translate(int a, int b){
		this.x = this.x +a ;
		this.y = this.y +b;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [abs=" + x + ", ord=" + y + "]";
	}
}
