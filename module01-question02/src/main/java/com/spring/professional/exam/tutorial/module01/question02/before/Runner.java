package com.spring.professional.exam.tutorial.module01.question02.before;

import com.spring.professional.exam.tutorial.module01.question02.common.renderer.color.DefaultColorRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.color.RedColorRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.style.DefaultFontStyleRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.weight.BoldFontWeightRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.weight.DefaultFontWeightRenderer;

public class Runner {
    public static void main(String... args) {
        var textRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer());
        textRenderer.render("Default Rendering");

        var redRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new RedColorRenderer(), new DefaultFontWeightRenderer());
        redRenderer.render("Red Color Rendering");

        var boldRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new BoldFontWeightRenderer());
        boldRenderer.render("Bold Rendering");
    }
}
