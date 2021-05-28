public class BmiService {
    public float calculate(int bodyMass, float bodyHeight) {
        float bodyMassIndex = (float)(bodyMass/(bodyHeight*bodyHeight));
        return bodyMassIndex;
    }
}
