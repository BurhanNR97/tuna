/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class GLCMFeatureExtraction {
	
	private BufferedImage image;
	public int[][] grayLeveledMatrix;
	private int grayLevel;
	private double contrast;
	private double homogenity;
	private double entropy;
	private double energy;
	private double dissimilarity;
        
        private double contrast0;
	private double homogenity0;
	private double entropy0;
	private double energy0;
	private double dissimilarity0;
        
        private double contrast45;
	private double homogenity45;
	private double entropy45;
	private double energy45;
	private double dissimilarity45;
        
        private double contrast90;
	private double homogenity90;
	private double entropy90;
	private double energy90;
	private double dissimilarity90;
        
        private double contrast135;
	private double homogenity135;
	private double entropy135;
	private double energy135;
	private double dissimilarity135;
        
        public double[][] cm0SN, cm45SN, cm90SN, cm135SN;

	public GLCMFeatureExtraction(File image, int grayLevel) throws IOException {
		this.image = ImageIO.read(image);
		this.grayLevel = grayLevel;
		grayLeveledMatrix = new int[this.image.getWidth()][this.image.getHeight()];
	}
	
	public void extract() {
		this.createGrayLeveledMatrix();
		
		//0°
		int[][] cm0 = createCoOccuranceMatrix(0);
		cm0SN = normalizeMatrix(add(cm0, transposeMatrix(cm0)));
		
		//45°
		int[][] cm45 = createCoOccuranceMatrix(45);
		cm45SN = normalizeMatrix(add(cm45, transposeMatrix(cm45)));
		
		//90°
		int[][] cm90 = createCoOccuranceMatrix(90);
		cm90SN = normalizeMatrix(add(cm90, transposeMatrix(cm90)));
		
		//135°
		int[][] cm135 = createCoOccuranceMatrix(135);
		cm135SN = normalizeMatrix(add(cm135, transposeMatrix(cm135)));
                
		this.contrast = (double) (calcContrast(cm0SN) + calcContrast(cm45SN) + calcContrast(cm90SN) + calcContrast(cm135SN)) / 4;
		this.homogenity = (double) (calcHomogenity(cm0SN) + calcHomogenity(cm45SN) + calcHomogenity(cm90SN) + calcHomogenity(cm135SN)) / 4;
		this.entropy = (double) (calcEntropy(cm0SN) + calcEntropy(cm45SN) + calcEntropy(cm90SN) + calcEntropy(cm135SN)) / 4;
		this.energy = (double) (calcEnergy(cm0SN) + calcEnergy(cm45SN) + calcEnergy(cm90SN) + calcEnergy(cm135SN)) / 4;
		this.dissimilarity = (double) (calcDissimilarity(cm0SN) + calcDissimilarity(cm45SN) + calcDissimilarity(cm90SN) + calcDissimilarity(cm135SN)) / 4;
		
                this.contrast0 = (double) calcContrast(cm0SN);
		this.homogenity0 = (double) calcHomogenity(cm0SN);
		this.entropy0 = (double) calcEntropy(cm0SN);
		this.energy0 = (double) calcEnergy(cm0SN);
		this.dissimilarity0 = (double) calcDissimilarity(cm0SN);
                
                this.contrast45 = (double) calcContrast(cm45SN);
		this.homogenity45 = (double) calcHomogenity(cm45SN);
		this.entropy45 = (double) calcEntropy(cm45SN);
		this.energy45 = (double) calcEnergy(cm45SN);
		this.dissimilarity45 = (double) calcDissimilarity(cm45SN);
                
                this.contrast90 = (double) calcContrast(cm90SN);
		this.homogenity90 = (double) calcHomogenity(cm90SN);
		this.entropy90 = (double) calcEntropy(cm90SN);
		this.energy90 = (double) calcEnergy(cm90SN);
		this.dissimilarity90 = (double) calcDissimilarity(cm90SN);
                
                this.contrast135 = (double) calcContrast(cm135SN);
		this.homogenity135 = (double) calcHomogenity(cm135SN);
		this.entropy135 = (double) calcEntropy(cm135SN);
		this.energy135 = (double) calcEnergy(cm135SN);
		this.dissimilarity135 = (double) calcDissimilarity(cm135SN);
	}
	
	private void createGrayLeveledMatrix() {
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				Color rgb = new Color(image.getRGB(i, j));
				int newR = rgb.getRed();
				int newG = rgb.getGreen();
				int newB = rgb.getBlue();
				int newA = rgb.getAlpha();
				int gr = (newR + newG + newB) / 3;
				
				if (grayLevel > 0 && grayLevel < 255) {
					grayLeveledMatrix[i][j] = gr * grayLevel / 255;
				} else {
					grayLeveledMatrix[i][j] = gr;
				}
			}
		}
	}
	
	public int[][] createCoOccuranceMatrix(int angle) { //distance = 1
		int[][] temp = new int[grayLevel+1][grayLevel+1];
		int startRow = 0;
		int startColumn = 0;
		int endColumn = 0;
		
		boolean validAngle = true;
		switch (angle) {
			case 0:
				startRow = 0;
				startColumn = 0;
				endColumn = grayLeveledMatrix[0].length-2;
				break;
			case 45:
				startRow = 1;
				startColumn = 0;
				endColumn = grayLeveledMatrix[0].length-2;
				break;
			case 90:
				startRow = 1;
				startColumn = 0;
				endColumn = grayLeveledMatrix[0].length-1;
				break;
			case 135:
				startRow = 1;
				startColumn = 1;
				endColumn = grayLeveledMatrix[0].length-1;
				break;
			default:
				validAngle = false;
				break;
		}
		
		if (validAngle) {
			for (int i = startRow; i < grayLeveledMatrix.length; i++) {
				for (int j = startColumn; j <= endColumn; j++) {
					switch (angle) {
						case 0:
							temp[grayLeveledMatrix[i][j]][grayLeveledMatrix[i][j+1]]++;
							break;
						case 45:
							temp[grayLeveledMatrix[i][j]][grayLeveledMatrix[i-1][j+1]]++;
							break;
						case 90:
							temp[grayLeveledMatrix[i][j]][grayLeveledMatrix[i-1][j]]++;
							break;
						case 135:
							temp[grayLeveledMatrix[i][j]][grayLeveledMatrix[i-1][j-1]]++;
							break;
					}
				}
			}
		}
		return temp;
	}
	
	private int[][] transposeMatrix(int [][] m){
		int[][] temp = new int[m[0].length][m.length];
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[0].length; j++){
				temp[j][i] = m[i][j];
			}
		}
		return temp;
	}
	
	private int[][] add(int [][] m2, int [][] m1){
		int[][] temp = new int[m1[0].length][m1.length];
		for (int i = 0; i < m1.length; i++){
			for (int j = 0; j < m1[0].length; j++){
				temp[j][i] = m1[i][j] + m2[i][j];
			}
		}
		return temp;
	}
	
	private int getTotal(int [][] m){
		int temp = 0;
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[0].length; j++){
				temp += m[i][j];
			}
		}
		return temp;
	}
	
	private double[][] normalizeMatrix(int [][] m){
		double[][] temp = new double[m[0].length][m.length];
		int total = getTotal(m);
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[0].length; j++){
				temp[j][i] = (double) m[i][j] / total;
			}
		}
		return temp;
	}
	
	public double calcContrast(double[][] matrix) {
		double temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				temp += matrix[i][j] * Math.pow(i-j, 2);
			}
		}
		return temp;
	}
	
	public double calcHomogenity(double[][] matrix) {
		double temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				temp += matrix[i][j] / (1+Math.pow(i-j, 2));
			}
		}
		return temp;
	}
	
	public double calcEntropy(double[][] matrix) {
		double temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] != 0) {
					temp += (matrix[i][j] * Math.log10(matrix[i][j])) * -1;
				}
			}
		}
		return temp;
	}
	
	public double calcEnergy(double[][] matrix) {
		double temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				temp += Math.pow(matrix[i][j], 2);
			}
		}
		return temp;
	}
	
	public double calcDissimilarity(double[][] matrix) {
		double temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				temp += matrix[i][j] * Math.abs(i-j);
			}
		}
		return temp;
	}

	public double getContrast() {
		return contrast;
	}

	public double getHomogenity() {
		return homogenity;
	}

	public double getEntropy() {
		return entropy;
	}

	public double getEnergy() {
		return energy;
	}

	public double getDissimilarity() {
		return dissimilarity;
	}
        
        public double getContrast0() {
		return contrast0;
	}

	public double getHomogenity0() {
		return homogenity0;
	}

	public double getEntropy0() {
		return entropy0;
	}

	public double getEnergy0() {
		return energy0;
	}

	public double getDissimilarity0() {
		return dissimilarity0;
	}
        
        public double getContrast45() {
		return contrast45;
	}

	public double getHomogenity45() {
		return homogenity45;
	}

	public double getEntropy45() {
		return entropy45;
	}

	public double getEnergy45() {
		return energy45;
	}

	public double getDissimilarity45() {
		return dissimilarity45;
	}
        
        public double getContrast90() {
		return contrast90;
	}

	public double getHomogenity90() {
		return homogenity90;
	}

	public double getEntropy90() {
		return entropy90;
	}

	public double getEnergy90() {
		return energy90;
	}

	public double getDissimilarity90() {
		return dissimilarity90;
	}
        
        public double getContrast135() {
		return contrast135;
	}

	public double getHomogenity135() {
		return homogenity135;
	}

	public double getEntropy135() {
		return entropy135;
	}

	public double getEnergy135() {
		return energy135;
	}

	public double getDissimilarity135() {
		return dissimilarity135;
	}
	
}
