package com.sam.lib.widget.nifty.effects;

/*
 * Copyright 2014 gitonway
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.animation.ObjectAnimator;
import android.view.View;


public class Flip extends BaseEffect {
    long s = mDuration, e = mDuration;

    @Override
    protected void setInAnimation(View view) {

        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(0);

        getAnimatorSet().playTogether(ObjectAnimator.ofFloat(view, "rotationX", -90, 0).setDuration(s), ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(s * 3 / 2)

        );
    }

    @Override
    protected void setOutAnimation(View view) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(0);
        getAnimatorSet().playTogether(ObjectAnimator.ofFloat(view, "rotationX", 0, -90).setDuration(e), ObjectAnimator.ofFloat(view, "alpha", 1, 0).setDuration(e * 3 / 2)

        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
