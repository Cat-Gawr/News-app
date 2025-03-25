from django.conf import settings
from django.db import models
from django.utils import timezone

class Snake(models.Model):
    name = models.CharField(max_length=200)
    created_date = models.DateTimeField(default=timezone.now)
    author = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)

    def __str__(self):
        return self.name
```

### 3. Create a migration and apply it

```bash
$ python manage.py makemigrations
$ python manage.py migrate
```

### 4. Create a serializer

```python
def SnakeSerializer(serializers.ModelSerializer):
    class Meta:
        model = Snake
        fields = ('id', 'name', 'created_date', 'author')
```

### 5. Create a view

```python
from rest_framework import viewsets
from .models import Snake
from .serializers import SnakeSerializer

class SnakeViewSet(viewsets.ModelViewSet):
    queryset = Snake.objects.all()
    serializer_class = SnakeSerializer
```


    
    
