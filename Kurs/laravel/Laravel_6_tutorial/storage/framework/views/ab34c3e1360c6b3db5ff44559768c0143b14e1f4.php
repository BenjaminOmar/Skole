<?php $__env->startSection('content'); ?>
<div class="flex-center position-ref full-height">
    <div class="content">
        <div class="title m-b-md">
            Pizza List
        </div>
        <p><?php echo e($name); ?></p>
        <p><?php echo e($age); ?></p>

        <?php $__currentLoopData = $pizzas; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $pizza): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <div>
                <?php echo e($pizza['type']); ?> - <?php echo e($pizza['base']); ?>

            </div>
        <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
    </div>
</div>
<?php $__env->stopSection(); ?>



<?php echo $__env->make('layouts.layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH /Users/benjamin/Desktop/skole/Github - skole/Kurs/laravel/Laravel_6_tutorial/resources/views/pizzas.blade.php ENDPATH**/ ?>