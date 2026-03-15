import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'currencyFormatPipeTs',
})
export class CurrencyFormatPipeTsPipe implements PipeTransform {
  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }
}
