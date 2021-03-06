package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

public final class FinderPattern extends ResultPoint {
    private final int count;
    private final float estimatedModuleSize;

    FinderPattern(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.estimatedModuleSize = f3;
        this.count = i;
    }

    public final float getEstimatedModuleSize() {
        return this.estimatedModuleSize;
    }

    /* access modifiers changed from: 0000 */
    public final int getCount() {
        return this.count;
    }

    /* access modifiers changed from: 0000 */
    public final boolean aboutEquals(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.estimatedModuleSize);
        if (abs <= 1.0f || abs <= this.estimatedModuleSize) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final FinderPattern combineEstimate(float f, float f2, float f3) {
        int i = this.count + 1;
        float x = (((float) this.count) * getX()) + f2;
        float f4 = (float) i;
        return new FinderPattern(x / f4, ((((float) this.count) * getY()) + f) / f4, ((((float) this.count) * this.estimatedModuleSize) + f3) / f4, i);
    }
}
