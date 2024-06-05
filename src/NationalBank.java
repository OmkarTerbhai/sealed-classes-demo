public sealed class NationalBank implements FloatingInterestRate
        permits SBI, PNB {

    protected final float RBI_REPO_RATE = 6.2F;
    @Override
    public float getCurrentInterest() {
        return RBI_REPO_RATE + 2;
    }
}
